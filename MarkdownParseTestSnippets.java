import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

public class MarkdownParseTestSnippets {
    @Test
    public void testSnippet1() throws IOException {
        String fileName = "/Users/yuxu/Documents/GitHub/markdown-parse/snippet1.md";
        List<String> expected = List.of("`google.com", "google.com", "ucsd.edu");
       
        assertEquals(expected, MarkdownParse.getLinks(Files.readString(Path.of(fileName))));


    }
    @Test
    public void testSnippet2() throws IOException{
        String fileName = "/Users/yuxu/Documents/GitHub/markdown-parse/snippet2.md";
        List<String> expected = List.of("a.com(())", "example.com");
        
        assertEquals(expected, MarkdownParse.getLinks(Files.readString(Path.of(fileName))));

        
        
    }

    @Test
    public void testSnippet3() throws IOException{
        String fileName = "/Users/yuxu/Documents/GitHub/markdown-parse/snippet3.md";
        List<String> expected = List.of("https://ucsd-cse15l-w22.github.io/");
        
        assertEquals(expected, MarkdownParse.getLinks(Files.readString(Path.of(fileName))));

    }

}
