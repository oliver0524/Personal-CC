package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidateUrl {

        public static void main(String[] args) {

            List<String> s1 = new ArrayList<>();
            s1.add("https://revature/partners.com");
            s1.add("https://revature.com");
            s1.add("https://youtube.com");
            s1.add("https://revature.com/partners/");
            s1.add("https://www.youtube.com/watch?v=Fk-4lXLM34g");
            s1.add("https://www.youtube.com/watch?v=Fk-4lXLM34g&t=72s");
            s1.add("https://tedbalashov.site");
            s1.add("https://youtube.mx");
            s1.add("https://youtube.ru");
            s1.add("https://youtube.ca");
            s1.add("tomato");
            s1.add("hbbps://revature.com");
            s1.add("https//revature.com");
            s1.add("https://revature");
            s1.add("https://revature.");
            s1.add("https://www.youtube.com?v=Fk-4lXLM34g/watch");

            for (int i=0; i< s1.size(); i++) {
                System.out.println("Here's the original url: " + s1.toArray()[i]);
                if (validate((String) s1.toArray()[i])) {
                    System.out.println("The url format is valid");
                } else {
                    System.out.println("The url format is invalid");
                }
            }

    }

    /**
     * the method should return true if the provided String represents a valid url, and false if it doesn't.
     *      * Valid URLs will follow the pattern https://website.extension, potentially with path parameters such as
     *      * https://website.extension/path, and potentially with a query param such as
     *      * https://website.extension/path?var=abc, or multiple query params, such as
     *      * https://website.extension/path?var1=abc&var2=xyz
     *      * <p>
     *      * A URL should always start with its protocol, https://
     *      * A URL must have any extension (such as .com)
     *      * The URL path should follow the extension, defined by a single slash /
     *      * The query parameters follow the path, defined by a question mark ?
     *      * <p>
     *      * Tip: some string methods, such as split, will parse regex. "." and "?" are technically regex
     *      * statements, but you can break out of regex in those cases using "\\." and "\\?" */
    public static boolean validate(String url) {
        // Split the URL into components
        String[] parts = url.split("\\?");
        String baseURL = parts[0];
        String queryParams = parts.length > 1 ? parts[1] : "";

        // Check if the URL starts with the protocol
        if (!baseURL.startsWith("https://")) {
            return false;
        }

        // Remove the protocol from the base URL
        String urlWithoutProtocol = baseURL.substring(8);

        // Split the base URL into domain and path
        String[] urlParts = urlWithoutProtocol.split("/");
        String domain = urlParts[0];
        String path = urlParts.length > 1 ? "/" + String.join("/", Arrays.copyOfRange(urlParts, 1, urlParts.length)) : "/";

        // Check if the domain contains a valid extension
        if (!domain.contains(".")) {
            return false;
        }

        // Check if the extension is valid
        String[] domainParts = domain.split("\\.");
        String extension = domainParts[domainParts.length - 1];
        if (extension.length() < 1 || extension.length() > 5) {
            return false;
        }

        // Check if the query parameters (if present) have valid format
        if (!queryParams.isEmpty()) {
            String[] params = queryParams.split("&");
            for (String param : params) {
                if (!param.matches("^[a-zA-Z0-9\\-._~%!$&'()*+,;=:@]+$")) {
                    return false;
                }
            }
        }
        // Check if the path is valid
        for (String pathPart : urlParts) {
            if (pathPart.length() > 0 && !pathPart.matches("^[a-zA-Z0-9\\-._~%!$&'()*+,;=:@]*$")) {
                return false;
            }
        }

        return true;
    }
}