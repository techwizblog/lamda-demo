package com.techwizblog;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;


import org.apache.log4j.Logger;
/**
 * Created by SIB on 9/17/2016.
 */
public class LambdaLog4j implements RequestHandler<Request, Response> {

    static final Logger log = Logger.getLogger(LambdaLog4j.class);

    public Response handleRequest(Request request, Context context){
        String greetingString = String.format("Request Message %s.", request.message);
        log.debug("log4j: Debug:" + greetingString);
        System.out.println("sout: Debug:" + greetingString);
        return new Response(greetingString);
    }
}
