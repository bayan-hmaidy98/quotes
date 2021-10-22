## Lab 08 

1. Read from a gson file and get required data from (author and text)
2. Insert the data in an array to iterate inside it in random index and get the data as required 
3. Test the method 

## Lab 09 :
In this lab, many methods were applied to get the required result: 
1. sendGetRequest, sends a request to the api (get)
2. setUpConnectionObject to have a connection to the api and start then reading from it only if the connection success
3. setBufferedReaderFromConnection to read from the api
4. addToGsonFile in order to add the quotes from the api if the connection happened
5. If the connection failed, get back to the json file and read from it only. 