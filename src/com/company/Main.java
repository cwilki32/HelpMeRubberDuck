package com.company;

public class Main {

    public static void main(String[] args) {
            String question = "Blah blah blah blah Blah blah blah blahBlah blah blah blahBlah blah blah blah" +
                    "Blah blah blah blahBlah blah blah blahBlah blah blah blahBlah blah blah blahBlah blah blah blah" +
                    "Blah blah blah blahBlah blah blah blahBlah blah blah blahBlah blah blah blahBlah blah blah blah" +
                    "Blah blah blah blahBlah blah blah blahBlah blah blah blahBlah blah blah blah";
            int count = 0;
            System.out.println("The entered string is: " + question);
            for (int i = 0; i < question.length(); i++) {

                if (question.charAt(i) != ' ')
                    count++;
            }
            System.out.println("Total number of characters in a string: " + count);

            if(count < 200) {
                System.out.println("Ask a better question!");
            } else if (count > 500) {
                System.out.println("Simplify your question!");
            } else
                System.out.println("Haha you asked a duck");
        }
    }

