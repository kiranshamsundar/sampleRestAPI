import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.MediaType.*;

// The Java class will be hosted at the URI path "/helloworld"
@Path("/helloworld")
public class XMLServiceController {



    // The Java method will process HTTP GET requests
    @GET
    // The Java method will produce content identified by the MIME Media type "text/plain"
    @Path("/get")
    @Produces("text/html")
    public String getClichedMessage() {
        // Return some cliched textual content
//        return "Hello World! finally with only Deploy";


//        return   "{ \"response\" : \"your string value\" }" ;

        System.out.println("Received request>>>>>>>>>>>>>>>>>");

        return "<!DOCTYPE html>\n" +
                "<html>\n" +
                "<body>\n" +
                "\n" +
                "<p><b>Hello World! Finally with only Deploy</b></p>\n" +
                "<p><i>This text is italic</i></p>\n" +
                "<p>This is<sub> subscript</sub> and <sup>superscript</sup></p>\n" +
                "\n" +
                "</body>\n" +
                "</html>\n";
    }


    // The Java method will process HTTP POST requests
    @POST
    @Path("/post")
    @Produces({TEXT_XML})
    @Consumes({TEXT_XML})
    public Response postXmlForTesting(User xml) {

        System.out.println("Received POST request>>>>>>>>>>>>>>>>>"+xml.getFirstName());

        return Response.ok(xml).build();




    }







}