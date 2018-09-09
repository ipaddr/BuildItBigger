/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package id.ipaddr.gradlecourse.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

import id.ipaddr.java.lib.android.udacity.gradle.JavaGradleCourse;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.gradlecourse.ipaddr.id",
                ownerName = "backend.gradlecourse.ipaddr.id",
                packagePath = ""
        )
)
public class MyEndpoint {

    /**
     * A simple endpoint method that takes a name and says Hi back
     */
    @ApiMethod(name = "sayHi")
    public MyBean sayHi(@Named("name") String name) {
        MyBean response = new MyBean();
        response.setData("Hi, " + name);
        return response;
    }

    @ApiMethod(name = "makeJokes")
    public MyBean makeJokes(){
        MyBean response = new MyBean();
        String joke = new JavaGradleCourse().getJoke();
        System.out.print(joke);
        response.setData(joke);
        return response;
    }

}
