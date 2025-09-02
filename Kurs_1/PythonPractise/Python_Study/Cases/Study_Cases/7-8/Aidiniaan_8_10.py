def binSearch(arr : list, target : int) -> int:
    left, right = 0, len(arr) - 1
    while left <= right:
        mid = (left + right) // 2
        if arr[mid] == target:
            return mid
        elif arr[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return -1

a = [3, 7, 8, 10, 13, 15, 16, 18,
     21, 23, 37, 39, 40, 44, 53]

print(binSearch(a, 39))
print(binSearch(a, 111))
print(binSearch(a, 37))