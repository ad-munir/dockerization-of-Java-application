# dockerization-of-Java-application

## Java Calculator with Docker

Java Calculator is a simple command-line calculator program written in Java. This README provides instructions for building and running the calculator using Docker.

## Prerequisites

- Docker: Make sure you have Docker installed and running on your system.

## Getting Started

1. Clone or download this repository to your local machine.

2. Open a terminal or command prompt and navigate to the directory containing the Dockerfile and Java source files.

## Building the Docker Image

To build the Docker image for the Java calculator, run the following command:

```bash
docker build -t java-calculator .
```

## Running the Calculator as a Docker Container

To run the application as a Docker container, execute the following command:

```bash
docker run -it --name calculator-container java-calculator
```

## Executing the container 

To execute the container :
```bash
docker exec -it calculator-container java Main
```
