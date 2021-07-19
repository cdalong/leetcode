class Solution:
    def subdomainVisits(self, cpdomains: List[str]) -> List[str]:
        domaindict = {}
        for domain in cpdomains:
            numberoftries = domain.split()[0]
            listofdomains = domain.split()[1].split(".")
            subdomains = []
            for i in range(len(listofdomains)):
                subdomains.append(".".join(listofdomains[i:])) #find the sub-list of subdomains, but I have no idea how this works
            
            for subdomain in subdomains:
                if subdomain in domaindict:
                    x = int(domaindict.get(subdomain))
                    x += int(numberoftries)
                    domaindict[subdomain] = x
                else:
                    domaindict[subdomain] = numberoftries
            result = []
            for key in domaindict.keys():
                result.append(str(domaindict[key]) + " " + str(key))
        return result