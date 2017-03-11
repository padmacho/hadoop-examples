'''
Created on 11-Mar-2017

@author: mario
'''
import collections
import time


if __name__ == '__main__':
        start_time = time.time()
        countDict = {}
        with open('/home/mario/git/hadoop-examples/DataSet/randomnumbers/dataset.txt') as f:  # Open file
            for line in f:  # read number
                number = int(line)
                if countDict.has_key(number):  # if number found increment it
                    countDict[number] = countDict[number] + 1 
                else:
                    countDict[number] = 1  # initialize
        print countDict
        print("Total time taken in  %s seconds ---" % (time.time() - start_time)) 
        # print collections.OrderedDict(sorted(countDict.items())) # sort by key and print
