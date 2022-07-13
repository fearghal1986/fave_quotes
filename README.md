# fave_quotes
Tech Test HMH

I had issues extracting the json information for Quotes when testing the filters (I presume this is due to the fact this was a list item rather than JSON) so as a workaround I used tag/search words whee I knew the amoount of json objects each search would return and count them. If I had more time I would have returned the actual information from each filter I was testing, add to a list and then iterate through the list to confirm their presence.

I should note on occasion the calls returned a 429 error. I left it as is but considered adding a wait between each test.

Its a maven project and the dependencies should all be present in the pom file.
