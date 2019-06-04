cloudfoundry-service-broker-sample

cloudfoundry-service-broker-sample is a sample project that implements the service-broker of cloudfoundry.

Service-broker sample provided by cloudfoundry is too simple to understand mechanism of service-broker.

But this project fully implements SaaS service, servcie-broker, consumer.

By running this project you can understand service-broker's mechanism easily.

structure



How to run

Further information: http://docs.cloudfoundry.org/services/api.html

Build projects and deploy.

mvn install
cf push
Create service-broker ID, PW is for http basic authentication, but calculator project is not use it.
 Use dummy data for ID, PW parametsers.

cf service-brokers


cf create-service-broker BROKER_NAME ID PW URL

// change service broker plans, you need to update service broker...

cf update-service-broker BROKER_NAME ID PW URL

URL: URL of calculator project.
Set access Set to allow access to the servcie-broker from particular org. Related information is available at cf service-access.

cf enable-service-access  
cf service-access


cf enable-service-access SERVICE_NAME -p PLAN -o ORG
Create service-instance 

cf create-service SERVICE_NAME PLAN SERVICE_INSTANCE_NAME
Bind service Bind servcie-instance to consumer project. 

cf bind-service APP_NAME SERVCE_INSTANCE_NAME