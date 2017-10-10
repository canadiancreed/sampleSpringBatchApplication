package com.creed.project.testApp.config;

import com.creed.project.testApp.processor.TestProcessor;
import com.creed.project.testApp.reader.TestReader;
import com.creed.project.testApp.writer.TestWriter;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBatchProcessing
public class TestAppJobConfig {

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    public TestAppJobConfig() { super(); }

    @Bean
    public Job testJobConfig(@Qualifier("testStepConfig") Step testStepConfig) {

        return jobBuilderFactory.get("Job Action Name")
                                .incrementer(new RunIdIncrementer())

                                .start(testStepConfig)

                                .build();
    }

    @Bean
    public Step testStepConfig(TestReader testReader,
                               TestProcessor testProcessor,
                               TestWriter testWriter) {

        return stepBuilderFactory.get("Step Action Name")
                                 .<String, String>chunk(1)
                                 .reader(testReader)
                                 .processor(testProcessor)
                                 .writer(testWriter)
                                 .build();


    }
}
