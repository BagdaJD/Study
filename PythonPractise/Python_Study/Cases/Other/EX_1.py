for a in 0, 1:
    for b in 0, 1:
        for c in 0, 1:
            f = b or (not a) or False                         
            print(f)

