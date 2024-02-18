const express = require('express')
const app = express()


require('dotenv').config({path: './config/.env'})

app.use(express.static('public'))

app.get('/', (req, res) => {
    res.sendFile(__dirname + "/views/index.html")
})

app.listen(process.env.PORT,  () => {
    console.log(`Listening on port ${process.env.PORT}.`)
})