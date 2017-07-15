# IndexBuilder

Forward index: save products information into MySQL
Invert index: read data from documents based on its keywords. Save Key-Value pair into Memcached as Term-Posting List.

1. Input: adsDataFilePath and budgetDataFilePath.
2. Memcached server and portal is predefined at 127.0.0.1:11211 @Main function.
3. MySQL server connection is predefined at 127.0.0.1:3306 @Main function
4. MySQL username and password is predefined as root and password @Main function.

