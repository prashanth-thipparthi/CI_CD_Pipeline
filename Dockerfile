# Start with the base image containing Java runtime
FROM java:8-jdk-alpine

#Add Maintainer info
LABEL maintainer="prashanth.reddyt09@gmail.com"

#Make port 8082 available
EXPOSE 8082

#The application's jar file
ARG JAR_FILE=target/demo-1.0.jar

#Copy the jat to the working directory
COPY ${JAR_FILE} /usr/app

#Set the working directory
WORKDIR /usr/app

#Run the jat file
ENTRYPOINT ["java","-jar","demo-1.0.jar"]