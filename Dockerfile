# Parent image
FROM maven:3-jdk-8

# Update the VM
RUN apt-get update

#Create app directory
RUN mkdir -p /usr/src/my-app
WORKDIR /usr/src/my-app

# Bundle app source
COPY . /usr/src/my-app

# Run maven install mvn plugins and to build the project
#RUN mvn install

#START THE APP
ENTRYPOINT ["java","-cp","target/my-app-1.0.jar","com.mycompany.app.App"]