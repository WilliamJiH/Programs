import urllib.request as request
import requests

proxies = {'https':'https://127.21.21.1:1080',
           'http':'http://127.21.21.1:1080'}

headers = {'user-agent':'Mozilla/5.0 (Windows NT 10.0; Win64; x64)AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.90 Safari/537.36'}

GOOGLE_URL = 'https://www.google.com'
opener = request.build_opener(request.ProxyHandler(proxies))
request.install_opener(opener)

req = request.Request(GOOGLE_URL,headers= headers)
response = request.urlopen(req)
print(response.read().decode())

response = requests.get(GOOGLE_URL, proxies = proxies)
print(response.text)
