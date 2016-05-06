package org.devspark.aws.lambdasupport.endpoint.annotations.apigateway;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Target({ TYPE, METHOD })
@Retention(RUNTIME)
public @interface ApiGateway {

    String name();

}
