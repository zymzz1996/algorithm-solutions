package com.zym.niuke;

public class BM83 {

    public static void main(String[] args) {
        String s = "aAnfdnehSr BJTPAySyYkavUXIETmoDPReWNy rZJrZW XwmioaCxQeLkLlBfzNofkVkxOxPTaAdmFajYbdCIIVQawQPdVAXu  poghvwCLzYYwUlepqUmyIJfJziyjVGQAOufRRNCoYPsYiqnVEeF FiAJvIZIyxEFMAmnvbyJEmZmwEx LjXDhNybiJWsfjXMDWsmGcsyffadbdwDXWRvIaMpEttdMGHMGZayenvEjXWnRKfIIAdC hmXrOGdMNvQqEiBjWUWWZlUgOqjxrqbeHHCEkfMc pvhVFVySzVjfuWWqfqtaNA oheskHJuavxkoMOdUpsXpCohaGSgaeOmCtaeKYFkrxTNBjnzZmMlAOFuXMHWrXTjRkdRgUQHXUtTHoivUGqNtJhXhVji AGLjmtJxfeuLwCxZkqLvda xkqTVEAehBA fzlRJkqhRVpHrWsUKGSimuWRiRVsAfmTFKZLABZFzSZqNKfItpgiZKCkdlkeBokVxxcyzSjoOiyLoOzVYzaqpTjmXSGLqCOgMmznsGUNLLgXFwUULAmbNouWyvCSMPOvoSEDKhEXSfSvcf PafQmbrlm N rrcETMIeCtQDdLCpAhtItzoOqpwipihLT vLsiGmJpgiypwSrJhnGseTTPNSTbNelEqxmbHQ LhHmCueKeuYoEkGZTTdpwTZOczhDsSEpVExmCBXFCeGyneWGkuKWu fSFMpPVUALEItBcrxxXfGot CCSBJbC LvZZIJnBWQEHVALBJRKFRBqxmaftalosCipTvuAKBduzSqEMU CdebRUZRxefJjlYBpuitguwxUZwzuHhJsefrnbSTyRWocPfupKqHySOJBCqpmVMxGBbcaGrMlAHwMGbgYt NPOpsYXThrrihhvNTzAnkuICJNdQmdcaaJwszXZJagMmvyBGmvdITFXYscPEfXyAtkqPIfQaSBLKNYCXBfjwvyZYNFYbklJAklBwdVaNsCj hFEtvKTsWJZ GVmXmzFNQmCWtiwhcWZridouFCdWPMnTQzvkoOpusiqCDBjeDuKphkQxBGWOCtOBKjizMjULNJIEZwkuNEbr OCySgqZQmKcRGfSCuPCFSzifySVzIl WmXKYxPIwHcNfYYeTmrtavUcPceWXloaehFqnY aTHIJfArGSZOulooJmaDD uOvhPJknprEsSdSQyxLgsEzZRnybUZsUligUVhxldILKhxdJgusPyeHXJsigqxTUGtllbqqvzXqGQjxWwldxVUAWLyPDmDBszeKuDGVcQxkHMAiWFKQaSYpQdBhIEEPttkdrHwJzVkASCrvyGNGDpMjLqBvBREXsxUinVlYqawbEvswacpGqRWxYjDVyOgQozDimDFhxHMtkIWXVWZBhziGbtw RiYCajEHhNqJz  FnFOLRqOKUsVkaFFhjUEdGUbirUcMfsFxPpSdcyVjuCVpAjAUQFXeKa TUtmCZvFXSHGqzBkaxIGOheetFOhGdCrPiMXCOwUQIvIIPtQpfnohdCPZicUCJAOJyfbjrZOFCqnuNzRbAeHkOyypGpQOSSVjGConmSTYOKLAWeuDYbzwpncRxOXKqq TYeBEW KvfHRLqlYDrakLBBPbeNGGFAbxBVDlcCeKaUqrstWWnbjHwFPTk FqEpAKtHgTqxHcfFGPPcsPcXIOzRlMGWTZCbCVKcIdJuW BhVCs LGDwJPdSHOS zcUDJEjYcbHJLPgQnuKcssFxnppmMsWBgAqCEFukeGKZZv nlhtvMsqz AAsTYBRvtzfSFJrStmUTlzIuYI ziPBzDAaBzwtIJdTkbaJlefJTnqbutmXzzAYvEMRmcegqyKlWPDkiibkFGpSAJUJARlloLE MwSqRnAXFxUalJVnVLnpxkfblREwmRDKKDWtTCBFoliYmoCakOzqDEpcCiQugSUlLhIcmIsrkTGKHgVrTMXfmMHBEa ccDxGarjctQbEdPfwZjYpxzZQNR";
        int n = s.length();
        String trans = new BM83().trans1(s, n);
        System.out.println(trans);

        String hope = "WNFmgzYagdvsjzhDkOxVEdRUtEKrZ PoblwqjGoupKViwXwskdPZAjcunyrgzdfmXVozpTHX XKWwutGbKnniWh epGPWAkNmLDRiCITTfFLgeUrpVPOMWODhknmYdyUEHifpVXXkILjEsoJvZyutUbcSYiFwhBPhiJUbOhheOETlLXmoryhmrXcifQcAyXcs QWOMBVNxKaAAWQtthcLBFVxDZMfyrPWCNurlnFhffmQYgREpySLIhRqQJXxDMsPcwHqWVixmsYYqODwyWkfqvAcbBSRVYbGO ATrwuoOjthhkoHEbcvkOqkIHiIOShtAYpaJmQIhoHtFCQmfVMPEpfFGehrzDwtcjtearEHCyQMblwbTLfMiesWcqHptQMaOkdIcxPGIkbTOuXSkXvZFZyKaahACrSEAwspByUcTzoRXcsyEzdwCAOTPtRqRdKAtr ML cqAzBcewuSRGbcmiucbUGVXHHuMRlUZYYtrSqZbNJLYavwLZEaovbAyITJyWlsefLYeiNdgpkHxugkrUMUslKkXXQKMCtblrbaTvdJgdaWlRqTqMEelCmTlRpEJPlFxmEnFQpjTOOwHArAZMRJkbHrUjsiLKxDomHTLojsswFvDYVswfPnjxEscWFFqyETEoWjuSqMvdJfMuCnWCGDDeGjso HtNeDMFWvRGPtUFojwZKUFo nBfweOjuWMJTDtDJCZmJnpVGwTVxxV UMPmRd sJDheqInnEMCgnobtRxbLJpqEIwCufKzp kayJDRALixxWmPYePXRufQalfpUvMqnoshaMYCoTJbssamenGTTrXupQeKczgHELfJPITiRvXXOJNcemVxntiPdyESuzZQczIFqcRRMZThSMawMKsuYEpXSLAbMpv XGolxiNbEGwZSVAzUATPsmYgPizabTNguASclnxhODarXkIwDPzuYmkOVnq swHDGohVtJLTRTWVsFjcmwzRDwLBeSFADJcRnRMwAdO oWyXXAtjgUJMyiRANIHppMuluNUNoTmLnEUYESUwVmLDXYYDSKKbcbnEvNLstVnDcghGNTlhJhFaDJgXPCzJHRXsEqtgWJbKSuVuLyCwrUbbbxVqtCmEIAgWoETViUOXDWVGpjGWVDkiXQtFuzDJAGutuWDPUubUyqeVEYAnE xHOQksnePVKFhfehGmpwCOVfscmkTKyKyIaktjcogYWMUYXJKNcCiQlfMfPooSrzWlSDdhZQmKjTZXhcIEJkVWutKrcyQioGYVksMAYwvrbKothwLYyZRZcEAGDhRxRRkdLmGcASuMXYFUKSCoqBaSFW DDchaHJHMnwwIqNQQoLjABwz HkOlDdlOFlAKkg mNckJbHEYsiPjbDimebsVGaXG atGWhelZaOyYMgzdjKTAjrASMMjtmmCaTtGEekYndqZQDIKEPFFN BbQmKxOgJUyuvxPWZApFYoycce zDnssMzKzPCCfqVhvlBnWteMkyKniwfzsmJGMolQwh yKSQHFCtcYhQrJAzzprC oLdBNAZdikIvwJEoeatCrsxqRu tzAByB dasegKGFhO bPQTimkSjQPzMRBtCaVgKqzQIxDLHEnHHXrNZPrCKgZVuKbrmfAJHYiQDHDWScmXqomZrLyYhesbUgFNmAjcHnxszfekZuuzFpUghAXHEao UCoUMXpbwwGSTbXwMxTEJeyWmREORMqbGDrjxigcjKEpzBdiZPlYHeQyKxPDlNdkfgnAaDypIWqSmvpvCaYvNUScjgOwaWEwPnFZpSPKBRrhwnAOIjeqqacMfAivxjCvMFyshDfWcNfCyzBnKCggoWdHuXZQYVEVVUIoPuYFGPMibmFyFBZOStpYuybmvPOWwrpftXzDX eJgwvLyuauYxVDjbMZJifXbUwfBRzgifzlbebSi fsMsgrwyBQPkcXOkHmYXPOOyZccuMlzJShHrcXVzVIdoeqUaYV rIotVwInaJrczeULzkXUsB";
        System.out.println(hope);


    }

    public String trans1 (String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i)  >= 'A' && s.charAt(i) <= 'Z') {
                sb.append((char)(s.charAt(i) + 32));
            } else if (s.charAt(i)  >= 'a' && s.charAt(i) <= 'z') {
                sb.append((char)(s.charAt(i) - 32));
            } else {
                sb.append(s.charAt(i));
            }
        }
        sb = sb.reverse();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                continue;
            }
            int j = i;
            //以空格为界，二次翻转
            while(j < n && sb.charAt(j) != ' ')
                j++;
            String temp = sb.substring(i,j);
            StringBuffer buffer = new StringBuffer(temp);
            temp = buffer.reverse().toString();
            sb.replace(i,j,temp);
            i = j;
        }

        return sb.toString();
    }

    public String trans (String s, int n) {
        String[] words = s.split(" ", -1);
        StringBuilder sb = new StringBuilder();
        for (int j = words.length - 1; j >= 0; j--) {
            String word = words[j];
            char[] chars = word.toCharArray();
            StringBuilder cb = new StringBuilder();
            for (char c : chars) {
                if (c >= 'A' && c <= 'Z') {
                    cb.append(Character.toLowerCase(c));
                } else {
                    cb.append(Character.toUpperCase(c));
                }
            }
            sb.append(cb).append(j > 0 ? " " : "");
        }
        return sb.toString();
    }

}
