package com.techwizblog;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

/**
 * Created by SIB on 9/17/2016.
 */
public class LambdaLog implements RequestHandler<Request, Response> {

    public Response handleRequest(Request request, Context context){
        LambdaLogger lambdaLogger = context.getLogger();
        String greetingString = String.format("Request Message %s.", request.message);
        lambdaLogger.log("lambdalog:" + greetingString);
        System.out.println("sout: Debug:" + greetingString);
        return new Response(greetingString);
    }
}
