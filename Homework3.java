package HomeWorks;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Homework3 {

    public static void main(String[] args)  {

        try {
            PrintWriter printWriter = new PrintWriter("twoPowerTable.html");
            printWriter.println("<html><head>  " +
                    "\n<title>Powers  of  Two</title>  " +
                    "\n</head>  " +
                    "\n<body>  " +
                    "\n<table  border  cellpadding=5>  " +
                    "\n<tr><th>Power  of  2</th><th>Value</th></tr>");

            for(int i = 0; i <= 10; i++){
                printWriter.println("<tr><td>" + i + "</td><td> " + Math.pow(2, i) + " </td></tr> ");
            }

            printWriter.println("</table>  " +
                    "\n</body></html> ");
            printWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
