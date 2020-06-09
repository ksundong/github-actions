# github-actions

## 프로젝트

gradle 기반의 spring 프로젝트  
controller로 테스트 할 예정

## 구상

CI가 완료되면 AWS CLI를 이용하여 S3 버킷에 build 된 파일을 업로드  
AWS Configuration은 [여기](https://docs.aws.amazon.com/ko_kr/cli/latest/userguide/cli-chap-configure.html)를 참조

그 다음 명령어 사용은 [여기](https://github.com/peterkimzz/aws-ssm-send-command/blob/master/entrypoint.sh)를 참조

aws workflow template을 참조하면, 인증키를 어떻게 넣어야 하는지 참고할 수 있을 듯

```yaml
- name: Configure AWS credentials
  uses: aws-actions/configure-aws-credentials@v1
  with:
    aws-access-key-id: ${{ secrets.AWS_ACCESS_KEY_ID }}
    aws-secret-access-key: ${{ secrets.AWS_SECRET_ACCESS_KEY }}
    aws-region: us-east-2
```

s3에 파일을 전송하는 것은 [여기](https://github.com/marketplace/actions/configure-aws-credentials-action-for-github-actions)를 참조

- 젠킨스 연동 테스트 빌드 속도는 얼마나 되는가? 7초? 9초?
