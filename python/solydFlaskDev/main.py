from flask import Flask, request, render_template

app = Flask(__name__)

@app.route("/")
def home():
    nome = request.args.get("nome")
    return render_template("index.html", username=nome)

app.run(debug=True)
