#sentiment analysis from elonmusk tweet

from textblob import TextBlob

musk = open("musk.txt").readlines()

for tweet in musk:
	print(tweet)
	analyze = TextBlob (tweet)
	print(analyze.sentiment)