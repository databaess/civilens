# syntax=docker/dockerfile:1.7

FROM mcr.microsoft.com/azure-functions/node:4-node20
WORKDIR /home/site/wwwroot

ENV AzureWebJobsScriptRoot=/home/site/wwwroot \
    AzureFunctionsJobHost__Logging__Console__IsEnabled=true

COPY package*.json ./
RUN if [ -f package-lock.json ]; then npm ci --omit=dev; else npm install --omit=dev; fi
RUN npm install -g azure-functions-core-tools@4 --unsafe-perm true

COPY host.json ./
COPY src ./src

EXPOSE 7071
CMD ["func", "start", "--port", "7071", "--javascript", "--cors", "*"]
