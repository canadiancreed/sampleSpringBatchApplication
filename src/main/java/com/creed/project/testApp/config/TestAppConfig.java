package com.creed.project.testApp.config;

import org.springframework.context.annotation.Configuration;

/**
 * @EnableBatchProcessing provides a base configuration for building batch jobs
 * <p>
 * JobRepository - bean name "jobRepository"
 * JobLauncher - bean name "jobLauncher"
 * JobRegistry - bean name "jobRegistry"
 * PlatformTransactionManager - bean name "transactionManager"
 * JobBuilderFactory - bean name "jobBuilders"
 * StepBuilderFactory - bean name "stepBuilders"
 */

@Configuration
public class TestAppConfig {

    /**
     * Default Constructor
     */
    public TestAppConfig() {
        super();
    }

//    @Bean
//    public TestReader testReader() {
//        return new TestReader();
//    }
//
//    @Bean
//    public TestProcessor testProcessor() {
//        return new TestProcessor();
//    }
//
//    @Bean
//    public TestWriter testWriter() {
//        return new TestWriter();
//    }

}