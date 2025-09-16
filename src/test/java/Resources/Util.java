package Resources;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Properties;

public class Util {

    public static RequestSpecification req;
    public static String place_id;

    // Request specification
    public static RequestSpecification requestspecification() throws Exception {
        if (req == null) {
            PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));

            req = new RequestSpecBuilder()
                    .setBaseUri(getGlobal("baseURI"))
                    .addQueryParam("key", "qaclick123")
                    .setContentType(ContentType.JSON)
                    .addFilter(RequestLoggingFilter.logRequestTo(log))
                    .addFilter(ResponseLoggingFilter.logResponseTo(log))
                    .build();
        }
        return req;
    }

    // Read properties
    public static String getGlobal(String key) throws Exception {
        Properties prop = new Properties();
        FileInputStream file = new FileInputStream(
                "C:\\Users\\admin\\Pictures\\JavaAssignnment\\BDD\\src\\test\\java\\Resources\\global.properties"
        );
        prop.load(file);
        return prop.getProperty(key);
    }
}
