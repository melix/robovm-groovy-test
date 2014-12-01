import groovy.transform.CompileStatic

@CompileStatic
class HelloWorld {
    public static void main(String[] args) {
        System.out.println('Hello, world!')
//        println 'Hello, world!'
    }
}

// System.out.println('Hello, world!')  -- works!
// println 'Hello, world!'  -- fails with:
// Exception in thread "main" java.lang.ExceptionInInitializerError
// 	at org.codehaus.groovy.runtime.InvokerHelper.<clinit>(InvokerHelper.java)
// 	at org.codehaus.groovy.runtime.DefaultGroovyMethods.println(DefaultGroovyMethods.java)
// 	at HelloWorld.main(HelloWorld.groovy)
// Caused by: java.lang.NullPointerException
// 	at org.codehaus.groovy.runtime.metaclass.MetaClassRegistryImpl.<init>(MetaClassRegistryImpl.java)
// 	at org.codehaus.groovy.runtime.metaclass.MetaClassRegistryImpl.<init>(MetaClassRegistryImpl.java)
// 	at groovy.lang.GroovySystem.<clinit>(GroovySystem.java)
// 	... 3 more



// also tested this script, without @CompileStatic and implicit main, fails with the same NPE
// println 'Hello, world!'
