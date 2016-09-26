package com.techwizblog;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.DynamodbEvent;

/**
 * Created by SIB on 9/20/2016.
 */
public class LambdaDynamoDB implements RequestHandler<DynamodbEvent, String> {
    @Override
    public String handleRequest(DynamodbEvent input, Context context) {
        StringBuilder builder = new StringBuilder();
        for (DynamodbEvent.DynamodbStreamRecord record : input.getRecords()) {
            builder.append(" Event ID:").append(record.getEventID());
        }
        System.out.println(builder.toString());
        return builder.toString();
    }
}

