static void sendSignatureRequest() throws HelloSignException {
    HelloSignClient client = new HelloSignClient("API KEY HERE");

    SignatureRequest request = new SignatureRequest();
    request.setTitle("NDA with Acme Co.");
    request.setSubject("The NDA we talked about");
    request.setMessage("Please sign this NDA and then we can discuss more. Let me know if you have any questions.");
    request.addSigner("latoya.williams+1@hellosign.com", "LaToya");
    request.addFile(new File("nda.pdf"));
    request.setTestMode(true);

    SignatureRequest newRequest = client.sendSignatureRequest(request);
    System.out.println(response.toString());
}
