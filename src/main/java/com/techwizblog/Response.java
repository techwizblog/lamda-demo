package com.techwizblog;

/**
 * Created by SIB on 9/17/2016.
 */
public class Response {
        String greetings;

        public String getGreetings() {
            return greetings;
        }

        public void setGreetings(String greetings) {
            this.greetings = greetings;
        }

        public Response(String greetings) {
            this.greetings = greetings;
        }

        public Response() {
        }
}
