package com.testing.lambda.logger;

public class LoggerContainer {

    public static Logger LOGGER = new Logger(new MockLambdaConsoleLogger());
}
