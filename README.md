# docker-app

Sample demo application of docker compose.

runs:
1. a Sample Web App over tomcat using saravak/tomcat8 image in docker container (http://localhost:8081/SampleWebApp/)
2. app1 - java app
3. app2 - java app
4. Terraform - terraform image

Add environmet variables with your AWS credential:
    ${AWS_ACCESS_KEY_ID}
    ${AWS_SECRET_ACCESS_KEY}
    ${AWS_REGION}
run: "docker compose up" in root project directory

It will build two images and run them.

Result expected:

[+] Running 2/2
⠿ Container docker-app2-1  Created                                                                                                      0.1s
⠿ Container docker-app1-1  Created                                                                                                      0.1s
Attaching to docker-app1-1, docker-app2-1
docker-app1-1  | Hello from docker demo APP1. Timestamp = Tue Dec 27 19:58:15 UTC 2022
docker-app2-1  | Hello from docker demo APP2. Timestamp = Tue Dec 27 19:58:15 UTC 2022
docker-app1-1 exited with code 0
docker-app2-1 exited with code 0
