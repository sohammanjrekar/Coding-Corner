const nodemailer = require("nodemailer");
var transport = nodemailer.createTransport({
  host: "sandbox.smtp.mailtrap.io",
  port: 2525,
  auth: {
    user: "f924c******a56",
    pass: "******1b5516a0",
  },
});

message = {
  from: "from-example@email.com",
  to: "to-example@email.com",
  subject: "Subject",
  text: "Hello SMTP Email",
};
transport.sendMail(message, function (err, info) {
  if (err) {
    console.log(err);
  } else {
    console.log(info);
  }
});
