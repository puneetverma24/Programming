def binarySearch(arr,f,l):
    mid=(f+l)//2
    if f<=l:

      if arr[mid]==x:
        print("found")
        return

      elif arr[mid]>x:
         l = mid -1
         binarySearch(arr,f,l)
      elif arr[mid]<x:
        f = mid + 1
        binarySearch(arr,f,l)

    else:
        print("not found")


arr=[10,20,30,40,50,60,70,80]
x=10
binarySearch(arr,0,len(arr)-1)




