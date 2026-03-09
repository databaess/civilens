# Civilens Docker Set-Up

## Setup env and run

```bash
cp backend/docker.env.example backend/docker.env
cp frontend/docker.env.example frontend/docker.env
```

Edit `backend/docker.env` and set real values for at least:
- `GEMINI_API_KEY`
- `AZURE_SPEECH_KEY`
- `SPEECH_KEY`
- `AzureWebJobsStorage` (Azure Storage connection string)

Run the project:

```bash
docker compose up --build
```

Stop the project:

```bash
docker compose down
```
