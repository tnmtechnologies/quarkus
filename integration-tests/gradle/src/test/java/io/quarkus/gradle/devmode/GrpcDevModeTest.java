//package io.quarkus.gradle.devmode;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//import com.google.common.collect.ImmutableMap;
// // TODO: to be uncommented with #10631
//public class GrpcDevModeTest extends QuarkusDevGradleTestBase {
//    @Override
//    protected String projectDirectoryName() {
//        return "grpc-multi-module-project";
//    }
//
//    @Override
//    protected void testDevMode() throws Exception {
//        assertThat(getHttpResponse("/hello")).isEqualTo("hello 2");
//
//        replace("application/src/main/proto/devmodetest.proto",
//                ImmutableMap.of("TEST_ONE = 2;", "TEST_ONE = 15;"));
//
//        Thread.sleep(1000);
//
//        assertThat(getHttpResponse("/hello")).isEqualTo("hello 15");
//    }
//}
