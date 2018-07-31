from flask import Flask, request
from werkzeug.utils import secure_filename
import os
import requests

UPLOAD_FOLDER = 'static/uploads/'
ALLOWED_EXTENSIONS = set(['png', 'jpg', 'txt', 'pdf'])

app = Flask(__name__)
app.config['UPLOAD_FOLDER'] = UPLOAD_FOLDER
app.config['ALLOWED_EXTENSIONS'] = ALLOWED_EXTENSIONS
app.config['MAX_CONTENT_LENGTH'] = 16 * 1024 * 1024
app.config['SECRET_KEY'] = '16557'


def allowed_file(filename):
    return '.' in filename and \
           filename.rsplit('.',1)[1] in ALLOWED_EXTENSIONS

@app.route('/')
def hello_world():
    return 'Welcome to this site, William Ji authorized!'

@app.route('/upload', methods=['POST'])
def upload():
    upload_file = request.files['file']
    if upload_file and allowed_file(upload_file.filename):
        filename = secure_filename(upload_file.filename)
        upload_file.save(os.path.join(app.root_path, app.config['UPLOAD_FOLDER'], filename))
        return 'Hi， '+request.form.get('name', 'BANANA')+'. success'
    else:
        return 'Hi '+request.form.get('name', 'BANANA')+'. failed'

if __name__ == '__main__':
    app.run(debug=True)

