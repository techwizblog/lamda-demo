package com.techwizblog;

/**
 * Created by SIB on 9/17/2016.
 */


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunc implements RequestHandler<Request, Response>{

    public Response handleRequest(Request request, Context context){
        String greetingString = String.format("Request Message %s.", request.message);
        return new Response(greetingString);
    }
}
