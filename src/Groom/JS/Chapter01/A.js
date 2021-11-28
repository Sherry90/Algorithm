const readline = require("readline");
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.on("line", line => {
    console.log(Math.max(line.split(" ")[0], line.split(" ")[1]));
    rl.close();
}).on("close", () => {
    process.exit();
});