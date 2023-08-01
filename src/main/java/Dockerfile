# Use the official OpenJDK image as the base image
FROM openjdk

# Set the working directory inside the container to /app
WORKDIR /app

# Copy all the files from the current directory into the container's /app directory
COPY . /app

# Compile the Java code inside the container to create the Main.class file
RUN javac Main.java

# Specify the default command to run when the container starts
CMD ["java", "Main"]
