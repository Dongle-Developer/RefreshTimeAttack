import AndroidXDependencies.androidx
import EtcDependencies.glide
import EtcDependencies.testEtc
import EtcDependencies.timber
import GoogleDependencies.dagger
import KotlinDependencies.coroutines
import NetworkDependencies.okhttp3
import NetworkDependencies.retrofit2
import RxDependencies.rxJava

androidApplicationConfig(Apps.APPLICATION_ID)

dependencies {
    androidx()
    coroutines()
    dagger()

    //Network
    okhttp3()
    retrofit2()

    //etc...
    rxJava()
    glide()
    timber()

    //test
    testEtc()
}