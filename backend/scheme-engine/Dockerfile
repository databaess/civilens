# syntax=docker/dockerfile:1.7

FROM node:20-alpine
WORKDIR /app

COPY package*.json ./
RUN npm ci --omit=dev

COPY server.js ./
COPY schemes ./schemes

EXPOSE 3001
CMD ["node", "server.js"]
