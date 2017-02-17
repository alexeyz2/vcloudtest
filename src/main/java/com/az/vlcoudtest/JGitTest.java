package com.az.vlcoudtest;

import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.TransportConfigCallback;
import org.eclipse.jgit.transport.JschConfigSessionFactory;
import org.eclipse.jgit.transport.OpenSshConfig;
import org.eclipse.jgit.transport.SshSessionFactory;
import org.eclipse.jgit.transport.SshTransport;
import org.eclipse.jgit.transport.Transport;
import org.eclipse.jgit.util.FS;

import java.io.File;
import java.util.Random;

/**
 * Created by az on 17/02/2017.
 */
public class JGitTest {
    public static void main(String[] args) {
//        String repoUri = "git@github.com:trilogy-group/autoST.git";
        String repoUri = "git@github.com:alexeyz-df/autoST.git";
        String localCheckoutPath = "Try_JGit20170215__" + new Random().nextInt(512);

        try {
            final SshSessionFactory sshSessionFactory = new JschConfigSessionFactory() {
                @Override
                protected void configure(OpenSshConfig.Host host, Session session) {
                    session.setConfig("StrictHostKeyChecking", "no");
                }
                @Override
                @Override
                protected JSch createDefaultJSch(FS fs ) throws JSchException {
                    JSch defaultJSch = super.createDefaultJSch( fs );
                    defaultJSch.addIdentity("/Users/az/.ssh/id_rsa");
                    return defaultJSch;
                }
            };

            Git git = Git.cloneRepository()
                    .setURI(repoUri)
                    .setDirectory(new File(localCheckoutPath))
                    .setBranch("HEAD")
                    .setTransportConfigCallback(new TransportConfigCallback() {
                        @Override
                        public void configure( Transport transport ) {
                            SshTransport sshTransport = ( SshTransport )transport;
                            sshTransport.setSshSessionFactory( sshSessionFactory );
                        }
                    } )
                    .call();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
