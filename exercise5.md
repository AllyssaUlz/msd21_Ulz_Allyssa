# Why are logging libraries used?

A logging library (or logging framework) is code that you embed into your application to create and manage log events. Logging libraries provide APIs for creating, structuring, formatting, and transmitting log events in a consistent way. Like agents, they're used to send events from your application to a destination. The difference is that unlike agents, libraries run with your application and not separately from it.

## The Benefits of Logging Libraries
Logging libraries are popular because of their portability, ubiquity, and ease of use. Libraries exist for all major programming languages and application frameworks, and most of these support most common log formats and transports. Installing a library is relatively quick, makes no permanent changes to your infrastructure, and prevents you from having to manage another service.Logging libraries are seeing a surge with the growing popularity of serverless applications. Developers use libraries to ensure their application logs to the same destination no matter where or when their application runs. For platforms where host access is impossible, libraries offer a practical solution.

*https://www.logdna.com/blog/logging-agents-vs-logging-libraries-which-should-you-use#:~:text=A%20logging%20library%20(or%20logging,your%20application%20to%20a%20destination.*


# What log levels are there in Log4J and what is it all about?

* ALL - All levels including custom levels
* DEBUG - Designates fine-grained informational events that are most useful to debug an application.
* INFO - Designates informational messages that highlight the progress of the application at coarse-grained level.
* WARN - Designates potentially harmful situations.
* ERROR - Designates error events that might still allow the application to continue running.
* FATAL - Designates very severe error events that will presumably lead the application to abort.
* OFF - The highest possible rank and is intended to turn off logging.
* TRACE - 	Designates finer-grained informational events than the DEBUG.

*https://www.tutorialspoint.com/log4j/log4j_logging_levels.htm*


# What configuration options does log4J offer you?
Automatic Configuration: Log4j2 follows a search order to look for the configuration files and I think they have explained best on their official website. Below is a copied content from there.

Log4j has the ability to automatically configure itself during initialization. When Log4j starts it will locate all the ConfigurationFactory plugins and arrange them in weighted order from highest to lowest. As delivered, Log4j contains four ConfigurationFactory implementations: one for JSON, one for YAML, one for properties, and one for XML.

*http://makeseleniumeasy.com/2021/03/24/log4j2-tutorial-3-setup-console-appender-using-xml-configuration-file/#Automatic_Configuration*

