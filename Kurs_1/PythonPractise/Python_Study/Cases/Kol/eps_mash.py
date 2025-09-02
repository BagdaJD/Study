eps_mash = 1.0 
e_ = eps_mash + 1.0 

while e_ > 1.0:
    eps_mash = eps_mash * 0.5
    e_ = eps_mash + 1.0 

eps_mash = eps_mash * 2 
print(eps_mash) 