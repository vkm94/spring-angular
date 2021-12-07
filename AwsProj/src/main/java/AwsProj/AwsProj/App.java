package AwsProj.AwsProj;

import java.io.File;
import java.util.List;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;


/**
 * Hello world!
 *
 */
public class App 
{
    
	public static void main( String[] args )
    {
    	
    	AWSCredentials credentials = new BasicAWSCredentials(
                "AKIAWFL4LIMT4LAPFSAY", 
                "sGXj56n2+sEfoiAk+xhWSUb4gt9T4aLbvcTvpt/s"
              );
    	AmazonS3 s3client = AmazonS3ClientBuilder
                .standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(Regions.US_EAST_1)
                .build();
    	String bucketName = "n204bucket3wersd";
    	
		/*
		 * if(s3client.doesBucketExist(bucketName)) {
		 * 
		 * return; } s3client.createBucket(bucketName);
		 */
        
        List<Bucket> buckets = s3client.listBuckets();
        for(Bucket bucket : buckets) {
            System.out.println(bucket.getName());
        }
        
        
        s3client.putObject(
                "n204bucket3wersd", 
                "myTest", 
                new File("H:\\name.txt")
              );
      
    }
}
