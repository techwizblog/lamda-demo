package com.techwizblog;

/**
 * Created by SIB on 9/17/2016.
 */
public class Request {
        String message;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Request(String message) {
            this.message = message;
        }

        public Request() {
        }
}
