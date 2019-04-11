import tweepy
from textblob import TextBlob

consumer_key = 'insert consumer key here'
consumer_secret = 'insert consumer secret here'

access_token = 'inser access token here'
access_token_secret = 'insert access token secret here'

auth = tweepy.OAuthHandler(consumer_key, consumer_secret)

auth.set_access_token(access_token , access_token_secret)

api = tweepy.API(auth)

cari = input("masukkan kata yang ingin di cari : ")
public_tweets=  api.search(cari)

for tweet in public_tweets:
	print(tweet.text)
	analysis = TextBlob (tweet.text)
	print (analysis.sentiment)