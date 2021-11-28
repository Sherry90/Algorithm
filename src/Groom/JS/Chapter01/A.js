const readline = require("readline");
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.on("line", line => {
    console.log(Math.max(parseInt(line.split(" ")[0]) ,parseInt(line.split(" ")[1])));
    rl.close();
}).on("close", () => {
    process.exit();
});