<h1>Caesar Cipher Code <small>for Java</small></h1>
<p>This code is an implementation to Caesar Cipher basic encryption algorithm.</p>
<h2>Instructions</h2>
<ol>
<li>Run <em>Receiver</em> file to start receiving message on socket</li>
<li>Run <em>CaesarCipher</em> to execute the program and encode + decode text</li>
</ol>
<h2>Explanation</h2>
<h3>CaesarCipher <small>class</small></h3>
<p>The <em>CaesarCipher</em> class has two functions and three constants.</p>
<strong>Functions</strong>
<p><em>encrypt(String plainMessage)</em> can encrypt the string message.<br /><em>decrypt(String cipherText)</em> can decrypt the string message.</p>
<strong>Constants</strong>
<p><em>ENCRYPTION_STRING</em> is the string used for encoding.<br /><em>SHIFT_KEY</em> is the hops to take during encoding of a letter by ENCRYPTION_STRING.<br /><em>PORT_NUMBER</em> is used by <em>Sender</em> and <em>Receiver</em> class to send and receive data over socket.</p>
<h3>Sender <small>class</small></h3>
<p>The <em>Sender</em> class has a single function <em>send(String message)</em> which transmits the message passed into the socket to be received by the server.</p>
<h3>Receiver <small>class</small></h3>
<p>The <em>Receiver</em> class runs as a standalone to receive the message coming through the socket. It then uses the <em>decrypt(String cipherText)</em> function to decode the incoming message.</p>
<h2>Acknowledgements</h2>
<p>All the help is taken from <a href="http://www.sanfoundry.com/java-program-implement-caesar-cypher/">SanFoundry.com</a>. I have just taken the time to write a little more generalized code and make things a bit more nicer. Still, a lot of thanks to the forementioned.