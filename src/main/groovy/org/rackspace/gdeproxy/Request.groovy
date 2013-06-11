package org.rackspace.gdeproxy

/**
 * A simple HTTP Request, with method, path, headers, and body.
 */
class Request {

    def method
    def path
    def headers
    def body

    String toString() {
        sprintf('Request(method=%r, path=%r, headers=%r, body=%r)', method, path, headers, body);
    }

}


//class Request:
//    """A simple HTTP Request, with method, path, headers, and body."""
//    def __init__(self, method, path, headers=None, body=None):
//        """
//Parameters:
//
//method - The HTTP method to use, such as 'GET', 'POST', or 'PUT'.
//path - The relative path of the resource requested.
//headers - An optional collection of name/value pairs, either a mapping
//object like ``dict``, or a HeaderCollection. Defaults to an empty
//collection.
//body - An optional request body. Defaults to the empty string.
//"""
//
//        if headers is None:
//            headers = {}
//
//        if body is None:
//            body = ''
//
//        self.method = str(method)
//        self.path = str(path)
//        self.headers = HeaderCollection(headers)
//        self.body = str(body)
//
//    def __repr__(self):
//        return ('Request(method=%r, path=%r, headers=%r, body=%r)' %
//                (self.method, self.path, self.headers, self.body))